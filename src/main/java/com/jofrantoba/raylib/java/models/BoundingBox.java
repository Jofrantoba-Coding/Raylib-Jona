package com.jofrantoba.raylib.java.models;

import com.jofrantoba.raylib.java.raymath.Vector3;

public class BoundingBox {

    public Vector3 min;
    public Vector3 max;

    public BoundingBox() {
        min = new Vector3();
        max = new Vector3();
    }

    public BoundingBox(Vector3 min, Vector3 max) {
        this.min = min;
        this.max = max;
    }

}
