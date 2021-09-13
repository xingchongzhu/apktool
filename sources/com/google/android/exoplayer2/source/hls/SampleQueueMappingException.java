package com.google.android.exoplayer2.source.hls;

import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.hls.s */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to bind a sample queue to TrackGroup with mime type ");
        sb.append(str);
        sb.append(".");
        super(sb.toString());
    }
}
