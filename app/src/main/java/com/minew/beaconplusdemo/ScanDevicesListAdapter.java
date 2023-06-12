package com.minew.beaconplusdemo;

import android.os.Build;

import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.minew.beaconplus.sdk.MTPeripheral;

import java.util.ArrayList;
import java.util.List;

public class ScanDevicesListAdapter extends BaseQuickAdapter<MTPeripheral, BaseViewHolder> {

    private List<DatosTlf> listaDatosTlf = new ArrayList<>();

    private double latitude;
    private double longitude;

    public ScanDevicesListAdapter(int layoutResId, List<MTPeripheral> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, MTPeripheral mtPeripheral) {
        String brand = Build.MANUFACTURER;
        String model = Build.MODEL;
        DatosTlf datosTlf = new DatosTlf(latitude, longitude, brand, model);
        DatosTlf.agregarDatosTlf(datosTlf);
        baseViewHolder.setText(R.id.tv_scan_device_mac, "Marca: " + Build.MANUFACTURER)
                .setText(R.id.tv_scan_device_battery, "Modelo: " + Build.MODEL)
                .setText(R.id.tv_scan_device_rssi, "Ubicación: " + "Lat: " + latitude + " Long: " + longitude);
    }

    public void setPhoneLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        notifyDataSetChanged(); // Actualizar la vista de la lista
    }
}

