class SpaceAge {
    double seconds;

    private static final double MAXIMUM_DELTA = 1E-02;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        double seconds = getSeconds();
        double earthSeconds = 31557600;
        return age(seconds / earthSeconds);
    }

    double onMercury() {
        double mercuryPeriod = 0.240846;
        return age(onEarth() / mercuryPeriod);
    }

    double onVenus() {
        double venusYears = 0.61519726;
        return age(onEarth() / venusYears);
    }

    double onMars() {
        double marsYears = 1.8808158;
        return age(onEarth() / marsYears);
    }

    double onJupiter() {
        double jupiterYears = 11.862615;
        return age(onEarth() / jupiterYears);
    }

    double onSaturn() {
        double saturnYears = 29.447498;
        return age(onEarth() / saturnYears);
    }

    double onUranus() {
        double uranusYears = 84.016846;
        return age(onEarth() / uranusYears);
    }

    double onNeptune() {
        double neptuneYears = 164.79132;
        return age(onEarth() / neptuneYears);
    }

    private double age(double age) {
        return Math.round(age * 100D) / 100D;
    }
}


