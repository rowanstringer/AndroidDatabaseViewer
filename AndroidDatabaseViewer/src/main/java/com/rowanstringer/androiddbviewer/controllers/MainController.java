package com.rowanstringer.androiddbviewer.controllers;

import com.rowanstringer.androiddbviewer.services.ADBService;
import com.rowanstringer.androiddbviewer.services.interfaces.IADBService;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class MainController
{
    public Label numberOfDevices;

    public void displayDevices(ActionEvent actionEvent)
    {
        IADBService adbService = new ADBService();

        numberOfDevices.setText("Number of devices: " + adbService.getDevices().size());
    }
}
