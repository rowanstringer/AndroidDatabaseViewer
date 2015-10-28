package com.rowanstringer.androiddbviewer.services.interfaces;

import com.rowanstringer.androiddbviewer.jadb.JadbDevice;

import java.util.List;

public interface IADBService
{
    List<JadbDevice> getDevices();
    void pullDatabase();
}
