package com.rowanstringer.androiddbviewer.services;

import com.rowanstringer.androiddbviewer.jadb.JadbConnection;
import com.rowanstringer.androiddbviewer.jadb.JadbDevice;
import com.rowanstringer.androiddbviewer.jadb.JadbException;
import com.rowanstringer.androiddbviewer.services.interfaces.IADBService;

import java.io.IOException;
import java.util.List;

public class ADBService implements IADBService
{
    public List<JadbDevice> getDevices()
    {
        JadbConnection jadb = null;

        try
        {
            jadb = new JadbConnection();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try
        {
            List<JadbDevice> devices = jadb.getDevices();
            System.out.println("There are " + devices.size() + " devices");

            return devices;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (JadbException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public void pullDatabase()
    {

    }
}
