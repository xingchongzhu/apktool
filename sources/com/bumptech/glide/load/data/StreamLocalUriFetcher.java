package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.n */
public class StreamLocalUriFetcher extends LocalUriFetcher<InputStream> {

    /* renamed from: d */
    private static final UriMatcher f10320d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f10320d = uriMatcher;
        String str = "com.android.contacts";
        uriMatcher.addURI(str, "contacts/lookup/*/#", 1);
        uriMatcher.addURI(str, "contacts/lookup/*", 1);
        uriMatcher.addURI(str, "contacts/#/photo", 2);
        uriMatcher.addURI(str, "contacts/#", 3);
        uriMatcher.addURI(str, "contacts/#/display_photo", 4);
        uriMatcher.addURI(str, "phone_lookup/*", 5);
    }

    public StreamLocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: i */
    private InputStream m12558i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f10320d.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m12559j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m12559j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    private InputStream m12559j(ContentResolver contentResolver, Uri uri) {
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: a */
    public Class<InputStream> mo8780a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo8781c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo8782d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream i = m12558i(uri, contentResolver);
        if (i != null) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("InputStream is null for ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }
}
