package com.bumptech.glide.load.p152n;

/* renamed from: com.bumptech.glide.load.n.b */
final class CallbackException extends RuntimeException {
    CallbackException(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
