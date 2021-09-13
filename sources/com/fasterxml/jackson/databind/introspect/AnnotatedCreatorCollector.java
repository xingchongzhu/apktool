package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass.Creators;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ClassUtil.Ctor;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class AnnotatedCreatorCollector extends CollectorBase {
    private final boolean _collectAnnotations;
    private AnnotatedConstructor _defaultConstructor;
    private final TypeResolutionContext _typeContext;

    AnnotatedCreatorCollector(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, boolean z) {
        super(annotationIntrospector);
        this._typeContext = typeResolutionContext;
        this._collectAnnotations = z;
    }

    private List<AnnotatedConstructor> _findPotentialConstructors(JavaType javaType, Class<?> cls) {
        List list;
        Ctor ctor;
        List<AnnotatedConstructor> list2;
        int i;
        Ctor[] constructors;
        Ctor[] constructors2;
        if (!javaType.isEnumType()) {
            ctor = null;
            list = null;
            for (Ctor ctor2 : ClassUtil.getConstructors(javaType.getRawClass())) {
                if (isIncludableConstructor(ctor2.getConstructor())) {
                    if (ctor2.getParamCount() == 0) {
                        ctor = ctor2;
                    } else {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(ctor2);
                    }
                }
            }
        } else {
            ctor = null;
            list = null;
        }
        if (list == null) {
            list2 = Collections.emptyList();
            if (ctor == null) {
                return list2;
            }
            i = 0;
        } else {
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(null);
            }
            List<AnnotatedConstructor> list3 = arrayList;
            i = size;
            list2 = list3;
        }
        if (cls != null) {
            MemberKey[] memberKeyArr = null;
            for (Ctor ctor3 : ClassUtil.getConstructors(cls)) {
                if (ctor3.getParamCount() == 0) {
                    if (ctor != null) {
                        this._defaultConstructor = constructDefaultConstructor(ctor, ctor3);
                        ctor = null;
                    }
                } else if (list != null) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            memberKeyArr[i3] = new MemberKey(((Ctor) list.get(i3)).getConstructor());
                        }
                    }
                    MemberKey memberKey = new MemberKey(ctor3.getConstructor());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i) {
                            break;
                        } else if (memberKey.equals(memberKeyArr[i4])) {
                            list2.set(i4, constructNonDefaultConstructor((Ctor) list.get(i4), ctor3));
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
        if (ctor != null) {
            this._defaultConstructor = constructDefaultConstructor(ctor, null);
        }
        for (int i5 = 0; i5 < i; i5++) {
            if (((AnnotatedConstructor) list2.get(i5)) == null) {
                list2.set(i5, constructNonDefaultConstructor((Ctor) list.get(i5), null));
            }
        }
        return list2;
    }

    private List<AnnotatedMethod> _findPotentialFactories(JavaType javaType, Class<?> cls) {
        Method[] classMethods;
        Method[] declaredMethods;
        List list = null;
        for (Method method : ClassUtil.getClassMethods(javaType.getRawClass())) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(method);
            }
        }
        if (list == null) {
            return Collections.emptyList();
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(null);
        }
        if (cls != null) {
            MemberKey[] memberKeyArr = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                if (Modifier.isStatic(method2.getModifiers())) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            memberKeyArr[i2] = new MemberKey((Method) list.get(i2));
                        }
                    }
                    MemberKey memberKey = new MemberKey(method2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        } else if (memberKey.equals(memberKeyArr[i3])) {
                            arrayList.set(i3, constructFactoryCreator((Method) list.get(i3), method2));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (((AnnotatedMethod) arrayList.get(i4)) == null) {
                arrayList.set(i4, constructFactoryCreator((Method) list.get(i4), null));
            }
        }
        return arrayList;
    }

    private AnnotationMap[] collectAnnotations(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this._collectAnnotations) {
            return CollectorBase.NO_ANNOTATION_MAPS;
        }
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i = 0; i < length; i++) {
            AnnotationCollector collectAnnotations = collectAnnotations(AnnotationCollector.emptyCollector(), annotationArr[i]);
            if (annotationArr2 != null) {
                collectAnnotations = collectAnnotations(collectAnnotations, annotationArr2[i]);
            }
            annotationMapArr[i] = collectAnnotations.asAnnotationMap();
        }
        return annotationMapArr;
    }

    public static Creators collectCreators(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, JavaType javaType, Class<?> cls, boolean z) {
        return new AnnotatedCreatorCollector(annotationIntrospector, typeResolutionContext, annotationIntrospector != null && !ClassUtil.isJDKClass(javaType.getRawClass())).collect(javaType, cls);
    }

    private static boolean isIncludableConstructor(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }

    /* access modifiers changed from: 0000 */
    public Creators collect(JavaType javaType, Class<?> cls) {
        List _findPotentialConstructors = _findPotentialConstructors(javaType, cls);
        List _findPotentialFactories = _findPotentialFactories(javaType, cls);
        if (this._collectAnnotations) {
            AnnotatedConstructor annotatedConstructor = this._defaultConstructor;
            if (annotatedConstructor != null && this._intr.hasIgnoreMarker(annotatedConstructor)) {
                this._defaultConstructor = null;
            }
            int size = _findPotentialConstructors.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (this._intr.hasIgnoreMarker((AnnotatedMember) _findPotentialConstructors.get(size))) {
                    _findPotentialConstructors.remove(size);
                }
            }
            int size2 = _findPotentialFactories.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (this._intr.hasIgnoreMarker((AnnotatedMember) _findPotentialFactories.get(size2))) {
                    _findPotentialFactories.remove(size2);
                }
            }
        }
        return new Creators(this._defaultConstructor, _findPotentialConstructors, _findPotentialFactories);
    }

    /* access modifiers changed from: protected */
    public AnnotatedConstructor constructDefaultConstructor(Ctor ctor, Ctor ctor2) {
        return new AnnotatedConstructor(this._typeContext, ctor.getConstructor(), collectAnnotations(ctor, ctor2), CollectorBase.NO_ANNOTATION_MAPS);
    }

    /* access modifiers changed from: protected */
    public AnnotatedMethod constructFactoryCreator(Method method, Method method2) {
        Annotation[][] annotationArr;
        int length = method.getParameterTypes().length;
        if (this._intr == null) {
            return new AnnotatedMethod(this._typeContext, method, CollectorBase._emptyAnnotationMap(), CollectorBase._emptyAnnotationMaps(length));
        }
        if (length == 0) {
            return new AnnotatedMethod(this._typeContext, method, collectAnnotations((AnnotatedElement) method, (AnnotatedElement) method2), CollectorBase.NO_ANNOTATION_MAPS);
        }
        TypeResolutionContext typeResolutionContext = this._typeContext;
        AnnotationMap collectAnnotations = collectAnnotations((AnnotatedElement) method, (AnnotatedElement) method2);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (method2 == null) {
            annotationArr = null;
        } else {
            annotationArr = method2.getParameterAnnotations();
        }
        return new AnnotatedMethod(typeResolutionContext, method, collectAnnotations, collectAnnotations(parameterAnnotations, annotationArr));
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.fasterxml.jackson.databind.introspect.AnnotationMap[]] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.annotation.Annotation[][]] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.fasterxml.jackson.databind.introspect.AnnotationMap[]] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.annotation.Annotation[][]] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6, types: [com.fasterxml.jackson.databind.introspect.AnnotationMap[]] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8, types: [com.fasterxml.jackson.databind.introspect.AnnotationMap[]] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.fasterxml.jackson.databind.introspect.AnnotationMap[], java.lang.annotation.Annotation[][]]
  uses: [java.lang.annotation.Annotation[][], ?[int, boolean, OBJECT, ARRAY, byte, short, char], com.fasterxml.jackson.databind.introspect.AnnotationMap[]]
  mth insns count: 73
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.introspect.AnnotatedConstructor constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil.Ctor r9, com.fasterxml.jackson.databind.util.ClassUtil.Ctor r10) {
        /*
            r8 = this;
            int r0 = r9.getParamCount()
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r8._intr
            if (r1 != 0) goto L_0x001c
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8._typeContext
            java.lang.reflect.Constructor r9 = r9.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r2 = com.fasterxml.jackson.databind.introspect.CollectorBase._emptyAnnotationMap()
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r0 = com.fasterxml.jackson.databind.introspect.CollectorBase._emptyAnnotationMaps(r0)
            r10.<init>(r1, r9, r2, r0)
            return r10
        L_0x001c:
            if (r0 != 0) goto L_0x0030
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8._typeContext
            java.lang.reflect.Constructor r2 = r9.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r8.collectAnnotations(r9, r10)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r10 = com.fasterxml.jackson.databind.introspect.CollectorBase.NO_ANNOTATION_MAPS
            r0.<init>(r1, r2, r9, r10)
            return r0
        L_0x0030:
            java.lang.annotation.Annotation[][] r1 = r9.getParameterAnnotations()
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L_0x009b
            java.lang.Class r2 = r9.getDeclaringClass()
            boolean r4 = com.fasterxml.jackson.databind.util.ClassUtil.isEnumType(r2)
            r5 = 0
            r6 = 1
            r7 = 2
            if (r4 == 0) goto L_0x0057
            int r4 = r1.length
            int r4 = r4 + r7
            if (r0 != r4) goto L_0x0057
            int r2 = r1.length
            int r2 = r2 + r7
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r7, r4)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r8.collectAnnotations(r2, r3)
        L_0x0055:
            r1 = r2
            goto L_0x0072
        L_0x0057:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L_0x0072
            int r2 = r1.length
            int r2 = r2 + r6
            if (r0 != r2) goto L_0x0072
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r6, r4)
            java.lang.annotation.Annotation[] r1 = com.fasterxml.jackson.databind.introspect.CollectorBase.NO_ANNOTATIONS
            r2[r5] = r1
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r8.collectAnnotations(r2, r3)
            goto L_0x0055
        L_0x0072:
            if (r3 == 0) goto L_0x0075
            goto L_0x00a6
        L_0x0075:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            r2[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r2[r6] = r9
            int r9 = r1.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r7] = r9
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            r10.<init>(r9)
            throw r10
        L_0x009b:
            if (r10 != 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            java.lang.annotation.Annotation[][] r3 = r10.getParameterAnnotations()
        L_0x00a2:
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r8.collectAnnotations(r1, r3)
        L_0x00a6:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8._typeContext
            java.lang.reflect.Constructor r2 = r9.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r8.collectAnnotations(r9, r10)
            r0.<init>(r1, r2, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector.constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }

    private AnnotationMap collectAnnotations(Ctor ctor, Ctor ctor2) {
        if (!this._collectAnnotations) {
            return CollectorBase._emptyAnnotationMap();
        }
        AnnotationCollector collectAnnotations = collectAnnotations(ctor.getDeclaredAnnotations());
        if (ctor2 != null) {
            collectAnnotations = collectAnnotations(collectAnnotations, ctor2.getDeclaredAnnotations());
        }
        return collectAnnotations.asAnnotationMap();
    }

    private final AnnotationMap collectAnnotations(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector collectAnnotations = collectAnnotations(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            collectAnnotations = collectAnnotations(collectAnnotations, annotatedElement2.getDeclaredAnnotations());
        }
        return collectAnnotations.asAnnotationMap();
    }
}
