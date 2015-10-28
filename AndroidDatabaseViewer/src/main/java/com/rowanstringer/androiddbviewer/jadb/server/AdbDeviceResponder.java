package com.rowanstringer.androiddbviewer.jadb.server;

import com.rowanstringer.androiddbviewer.jadb.JadbException;
import com.rowanstringer.androiddbviewer.jadb.RemoteFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by vidstige on 20/03/14.
 */
public interface AdbDeviceResponder {
    String getSerial();
    String getType();

    void filePushed(RemoteFile path, int mode, ByteArrayOutputStream buffer) throws JadbException;
    void filePulled(RemoteFile path, ByteArrayOutputStream buffer) throws JadbException, IOException;
}
