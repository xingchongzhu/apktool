package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Value;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public interface VisibilityChecker<T extends VisibilityChecker<T>> {

    /* renamed from: com.fasterxml.jackson.databind.introspect.VisibilityChecker$1 */
    static /* synthetic */ class C17921 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.annotation.PropertyAccessor[] r0 = com.fasterxml.jackson.annotation.PropertyAccessor.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = r0
                com.fasterxml.jackson.annotation.PropertyAccessor r1 = com.fasterxml.jackson.annotation.PropertyAccessor.GETTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.PropertyAccessor r1 = com.fasterxml.jackson.annotation.PropertyAccessor.SETTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.PropertyAccessor r1 = com.fasterxml.jackson.annotation.PropertyAccessor.CREATOR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.PropertyAccessor r1 = com.fasterxml.jackson.annotation.PropertyAccessor.FIELD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.PropertyAccessor r1 = com.fasterxml.jackson.annotation.PropertyAccessor.IS_GETTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.PropertyAccessor r1 = com.fasterxml.jackson.annotation.PropertyAccessor.ALL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.VisibilityChecker.C17921.<clinit>():void");
        }
    }

    public static class Std implements VisibilityChecker<Std>, Serializable {
        protected static final Std DEFAULT;
        private static final long serialVersionUID = 1;
        protected final Visibility _creatorMinLevel;
        protected final Visibility _fieldMinLevel;
        protected final Visibility _getterMinLevel;
        protected final Visibility _isGetterMinLevel;
        protected final Visibility _setterMinLevel;

        static {
            Visibility visibility = Visibility.PUBLIC_ONLY;
            Visibility visibility2 = Visibility.ANY;
            Std std = new Std(visibility, visibility, visibility2, visibility2, visibility);
            DEFAULT = std;
        }

        public Std(JsonAutoDetect jsonAutoDetect) {
            this._getterMinLevel = jsonAutoDetect.getterVisibility();
            this._isGetterMinLevel = jsonAutoDetect.isGetterVisibility();
            this._setterMinLevel = jsonAutoDetect.setterVisibility();
            this._creatorMinLevel = jsonAutoDetect.creatorVisibility();
            this._fieldMinLevel = jsonAutoDetect.fieldVisibility();
        }

        private Visibility _defaultOrOverride(Visibility visibility, Visibility visibility2) {
            return visibility2 == Visibility.DEFAULT ? visibility : visibility2;
        }

        public static Std construct(Value value) {
            return DEFAULT.withOverrides(value);
        }

        public static Std defaultInstance() {
            return DEFAULT;
        }

        /* access modifiers changed from: protected */
        public Std _with(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            if (visibility == this._getterMinLevel && visibility2 == this._isGetterMinLevel && visibility3 == this._setterMinLevel && visibility4 == this._creatorMinLevel && visibility5 == this._fieldMinLevel) {
                return this;
            }
            Std std = new Std(visibility, visibility2, visibility3, visibility4, visibility5);
            return std;
        }

        public boolean isCreatorVisible(Member member) {
            return this._creatorMinLevel.isVisible(member);
        }

        public boolean isFieldVisible(Field field) {
            return this._fieldMinLevel.isVisible(field);
        }

        public boolean isGetterVisible(Method method) {
            return this._getterMinLevel.isVisible(method);
        }

        public boolean isIsGetterVisible(Method method) {
            return this._isGetterMinLevel.isVisible(method);
        }

        public boolean isSetterVisible(Method method) {
            return this._setterMinLevel.isVisible(method);
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", new Object[]{this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel});
        }

        public boolean isCreatorVisible(AnnotatedMember annotatedMember) {
            return isCreatorVisible(annotatedMember.getMember());
        }

        public boolean isFieldVisible(AnnotatedField annotatedField) {
            return isFieldVisible(annotatedField.getAnnotated());
        }

        public boolean isGetterVisible(AnnotatedMethod annotatedMethod) {
            return isGetterVisible(annotatedMethod.getAnnotated());
        }

        public boolean isIsGetterVisible(AnnotatedMethod annotatedMethod) {
            return isIsGetterVisible(annotatedMethod.getAnnotated());
        }

        public boolean isSetterVisible(AnnotatedMethod annotatedMethod) {
            return isSetterVisible(annotatedMethod.getAnnotated());
        }

        public Std withCreatorVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._creatorMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._creatorMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, visibility2, this._fieldMinLevel);
            return std;
        }

        public Std withFieldVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._fieldMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._fieldMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, visibility2);
            return std;
        }

        public Std withGetterVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._getterMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._getterMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(visibility2, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
            return std;
        }

        public Std withIsGetterVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._isGetterMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._isGetterMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, visibility2, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
            return std;
        }

        public Std withOverrides(Value value) {
            if (value == null) {
                return this;
            }
            return _with(_defaultOrOverride(this._getterMinLevel, value.getGetterVisibility()), _defaultOrOverride(this._isGetterMinLevel, value.getIsGetterVisibility()), _defaultOrOverride(this._setterMinLevel, value.getSetterVisibility()), _defaultOrOverride(this._creatorMinLevel, value.getCreatorVisibility()), _defaultOrOverride(this._fieldMinLevel, value.getFieldVisibility()));
        }

        public Std withSetterVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._setterMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._setterMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, this._isGetterMinLevel, visibility2, this._creatorMinLevel, this._fieldMinLevel);
            return std;
        }

        public Std withVisibility(PropertyAccessor propertyAccessor, Visibility visibility) {
            switch (C17921.$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[propertyAccessor.ordinal()]) {
                case 1:
                    return withGetterVisibility(visibility);
                case 2:
                    return withSetterVisibility(visibility);
                case 3:
                    return withCreatorVisibility(visibility);
                case 4:
                    return withFieldVisibility(visibility);
                case 5:
                    return withIsGetterVisibility(visibility);
                case 6:
                    return with(visibility);
                default:
                    return this;
            }
        }

        public Std with(JsonAutoDetect jsonAutoDetect) {
            if (jsonAutoDetect == null) {
                return this;
            }
            return _with(_defaultOrOverride(this._getterMinLevel, jsonAutoDetect.getterVisibility()), _defaultOrOverride(this._isGetterMinLevel, jsonAutoDetect.isGetterVisibility()), _defaultOrOverride(this._setterMinLevel, jsonAutoDetect.setterVisibility()), _defaultOrOverride(this._creatorMinLevel, jsonAutoDetect.creatorVisibility()), _defaultOrOverride(this._fieldMinLevel, jsonAutoDetect.fieldVisibility()));
        }

        public Std(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this._getterMinLevel = visibility;
            this._isGetterMinLevel = visibility2;
            this._setterMinLevel = visibility3;
            this._creatorMinLevel = visibility4;
            this._fieldMinLevel = visibility5;
        }

        public Std with(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                return DEFAULT;
            }
            return new Std(visibility);
        }

        public Std(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                Std std = DEFAULT;
                this._getterMinLevel = std._getterMinLevel;
                this._isGetterMinLevel = std._isGetterMinLevel;
                this._setterMinLevel = std._setterMinLevel;
                this._creatorMinLevel = std._creatorMinLevel;
                this._fieldMinLevel = std._fieldMinLevel;
                return;
            }
            this._getterMinLevel = visibility;
            this._isGetterMinLevel = visibility;
            this._setterMinLevel = visibility;
            this._creatorMinLevel = visibility;
            this._fieldMinLevel = visibility;
        }
    }

    boolean isCreatorVisible(AnnotatedMember annotatedMember);

    boolean isCreatorVisible(Member member);

    boolean isFieldVisible(AnnotatedField annotatedField);

    boolean isFieldVisible(Field field);

    boolean isGetterVisible(AnnotatedMethod annotatedMethod);

    boolean isGetterVisible(Method method);

    boolean isIsGetterVisible(AnnotatedMethod annotatedMethod);

    boolean isIsGetterVisible(Method method);

    boolean isSetterVisible(AnnotatedMethod annotatedMethod);

    boolean isSetterVisible(Method method);

    T with(Visibility visibility);

    T with(JsonAutoDetect jsonAutoDetect);

    T withCreatorVisibility(Visibility visibility);

    T withFieldVisibility(Visibility visibility);

    T withGetterVisibility(Visibility visibility);

    T withIsGetterVisibility(Visibility visibility);

    T withOverrides(Value value);

    T withSetterVisibility(Visibility visibility);

    T withVisibility(PropertyAccessor propertyAccessor, Visibility visibility);
}
