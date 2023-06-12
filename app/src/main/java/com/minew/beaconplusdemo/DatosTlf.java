package com.minew.beaconplusdemo;

import java.util.ArrayList;
import java.util.List;

public class DatosTlf {

    public static List<DatosTlf> listaDatosTlf = new ArrayList<>();

        private double latitude;

        private double longitude;
        private String brand;
        private String model;


        public DatosTlf(double location, double longitude, String brand, String model) {
            this.latitude = latitude;
            this.longitude = longitude;
            this.brand = brand;
            this.model = model;
        }

        public static void agregarDatosTlf(DatosTlf datosTlf) {
        listaDatosTlf.add(datosTlf);
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

    }


