class ResistorColor {
    String[] colourArray = {"black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"};

    int colorCode(String color) {
        int index = 0;
        for (int i = 0; i < colourArray.length; i++) {
            if (color.equalsIgnoreCase(colourArray[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    String[] colors() {
        return colourArray;
    }
}
