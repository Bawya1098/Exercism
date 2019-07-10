import java.util.ArrayList;
import java.util.List;

class TwelveDays {
    String[] days = {"first", "second", "third",
            "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth",
            "tenth", "eleventh", "twelfth"};
    String[] gifts = {"twelve Drummers Drumming, ", "eleven Pipers Piping, ", "ten Lords-a-Leaping, ", "nine Ladies Dancing, ",
            "eight Maids-a-Milking, ", "seven Swans-a-Swimming, ", "six Geese-a-Laying, ", "five Gold Rings, ",
            "four Calling Birds, ", "three French Hens, ", "two Turtle Doves, ", "a Partridge in a Pear Tree.\n"};

     String sing() {
        return verses(1, 12);
    }

     String verses(int startVerse, int stopVerse) {
        String result = "";
        List<String> lyrics = new ArrayList<>();
        for (int i = startVerse; i <= stopVerse; i++) {
            if (i != stopVerse)
                lyrics.add(verse(i) + "\n");
            else
                lyrics.add(verse(i));
        }
        for (String s : lyrics) {
            result += s;
        }
        return result;
    }

     String verse(int number) {
        StringBuilder lyrics;
        lyrics = new StringBuilder(String.format("On the %s", days[number - 1] + " day of Christmas my true love gave to me: "));
        int wordIndex = gifts.length - number;
        if (wordIndex != gifts.length - 1)
            for (int j = wordIndex; j < gifts.length; j++) {
                if (j == gifts.length - 1) {
                    lyrics.append("and ").append(gifts[j]);
                } else {
                    lyrics.append(gifts[j]);
                }
            }
        else {
            lyrics.append(gifts[wordIndex]);
        }

        return lyrics.toString();
    }

}

