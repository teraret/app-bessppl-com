package app.bessppl.com

import java.text.Normalizer
import java.util.regex.Pattern

class SlugUrl {

    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]")
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]")

      String toSlug(String input) {
//        String nowhitespace = WHITESPACE.matcher(input).replaceAll("-")
//        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD)
//        String slug = NONLATIN.matcher(normalized).replaceAll("")
//        return slug.toLowerCase(Locale.ENGLISH)

         // return input.replace(" ","-")
          return "hello"
    }
}