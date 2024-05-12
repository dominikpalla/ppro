package cz.uhk.ppro.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Car {

    @NotEmpty(message = "SPZ is required")
    private String spz;
    @NotEmpty(message = "Color is required")
    private String color;
    @Size(min = 1, max = 5)
    private float tankVolume;
    @Size(min = 2, max = 9)
    private int numberOfSeats;

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(float tankVolume) {
        this.tankVolume = tankVolume;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
