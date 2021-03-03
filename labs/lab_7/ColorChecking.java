package lab_7;

public class ColorChecking {
    // source: https://donatbalipapp.medium.com/colours-maths-90346fb5abda

    private int red;
    private int green;
    private int blue;

    private double redRange;
    private double greenRange;
    private double blueRange;

    private double minRange;
    private double maxRange;

    private double hue;
    private double luminosity;
    private double saturation;

    public void setRGB(String rgbString) {
        String[] values = new String[4];

        values = rgbString.split(",|\\(|\\)|\\s");
        try {
            setRed(Integer.parseInt(values[1]));
            setGreen(Integer.parseInt(values[2]));
            seetBlue(Integer.parseInt(values[3]));
        } catch (NumberFormatException e) {
            System.out.println("A invalid rgb value was given, please follow the format:(##,##,##)");
        }

    }

    public double getHue() {
        setRanges();
        setMaxMin();

        if (this.hue > 0) {
            this.hue = this.hue * 60;
        } else {
            this.hue = (this.hue + 360) * 60;
        }
        this.hue = Math.ceil(this.hue);

        return this.hue;
    }

    public double getLuminosity() {
        if (this.minRange != 0 && this.maxRange != 0) {
            this.getHue();
        }
        this.luminosity = (0.5) * (this.maxRange + this.minRange);
        return this.luminosity;
    }

    public double getSaturation() {
        if (this.luminosity == 0) {
            getLuminosity();
        }
        if (this.luminosity < 1) {
            this.saturation = (this.maxRange - this.minRange) / (1.0 - (2.0 * this.luminosity - 1.0));
        } else if (this.saturation == 1) {
            this.saturation = 0;
        }
        return this.saturation;
    }

    private void setRanges() {
        this.redRange = (double) this.red / 255;
        this.greenRange = (double) this.green / 255;
        this.blueRange = (double) this.blue / 255;
    }

    private void setMaxMin() {
        if (this.redRange > this.greenRange && this.redRange > this.blueRange) {
            this.maxRange = this.redRange;
            if (this.greenRange == this.blueRange) {
                this.minRange = greenRange;
            } else if (this.greenRange > this.blueRange) {
                this.minRange = this.blueRange;
            } else {
                this.minRange = this.greenRange;
            }

            this.hue = (greenRange - blueRange) / (this.maxRange - this.minRange);
        } else if (this.greenRange > this.redRange && this.greenRange > this.blueRange) {
            this.maxRange = this.greenRange;
            if (this.redRange == this.blueRange) {
                this.minRange = this.redRange;
            } else if (this.redRange > this.blueRange) {
                this.minRange = this.blueRange;
            } else {
                this.minRange = this.redRange;
            }

            this.hue = 2.0 + (this.blueRange - this.redRange) / (this.maxRange - this.minRange);
        } else {
            this.maxRange = this.blueRange;
            if (this.redRange == this.greenRange) {
                this.minRange = this.redRange;
            }
            if (this.redRange > this.greenRange) {
                this.minRange = this.greenRange;
            } else {
                this.minRange = this.redRange;
            }
            this.hue = 4.0 + (this.redRange - this.greenRange) / (this.maxRange - this.minRange);
        }
    }

    private void setRed(int red) {
        this.red = red;
    }

    private void setGreen(int green) {
        this.green = green;
    }

    private void seetBlue(int blue) {
        this.blue = blue;
    }

}
