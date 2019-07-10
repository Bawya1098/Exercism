class BeerSong {
    String sing(int number, int lyrics) {
        StringBuilder sb = new StringBuilder();
        while (lyrics > 0) {
            lyrics--;
            if (number > 2) {
                sb.append(number).append(" bottles of beer on the wall, ").append(number).append(" bottles of beer.\n");
                number--;
                sb.append("Take one down and pass it around, ").append(number).append(" bottles of beer on the wall.\n\n");
            } else if (number == 2) {
                sb.append("2 bottles of beer on the wall, 2 bottles of beer.\n");
                sb.append("Take one down and pass it around, 1 bottle of beer on the wall.\n\n");
                number--;
            } else if (number == 1) {
                sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n");
                number--;
                sb.append("Take it down and pass it around, no more bottles of beer on the wall.\n\n");
            } else {
                number = 99;
                sb.append("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n");
            }
        }
        return sb.toString();
    }

    String singSong() {
        return sing(99, 100);
    }

}

