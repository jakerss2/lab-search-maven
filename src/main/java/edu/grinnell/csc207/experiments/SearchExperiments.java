package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.function.Predicate;

import edu.grinnell.csc207.util.SearchUtils;

/**
 * Assorted experiments for searching structures.
 *
 * @author Your Name Here
 * @author Your Name Here
 * @author Samuel A. Rebelsky (starter code)
 */
public class SearchExperiments {
  /**
   * Run our experimens.
   *
   * @param args
   *   Command-line arguments. Ignored.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    String[] tmp =
        new String[] { "alpha", "bravo", "charlie", "delta", "echo",
                       "foxtrot", "golf", "hotel", "india",
                       "juliett", "kilo", "lima", "mike",
                       "november", "oscar", "papa", "quebec",
                       "romeo", "sierra", "tango", "uniform",
                       "victor", "whiskey", "xray", "yankee", "zulu" };
    ArrayList<String> strings = new ArrayList<String>(Arrays.asList(tmp));

    Predicate<String> lessThanFiveChars = new Predicate<String>() {
      public boolean test(String str) {
        return (str.length() < 5);
      } // test(String)
    };

    try {
      String ex1c = SearchUtils.search(strings, lessThanFiveChars);
      pen.println("The first string of fewer than five letters is " + ex1c);
    } catch (Exception e) {
      pen.println("There are no strings of fewer than five letters.");
    } // try/catch

    try {
      String ex1g = SearchUtils.search(strings, (s) -> s.length() == 6);
      pen.println("The first string of exactly six letters is " + ex1g);
    } catch (Exception e) {
      pen.println("There are no strings of exactly six letters.");
    } // try/catch

    try {
      String ex1g = SearchUtils.search(strings, (s) -> s.contains("u"));
      pen.println("The first string containing 'u' is " + ex1g);
    } catch (Exception e) {
      pen.println("There are no strings containing 'u'.");
    } // try/catch


    int[] arr = new int[1000];

      for (int i = 0; i < 1000; i++) {
        arr[i] = 2*i;
      } // for
      for (int j = 0; j < (999); j++) {
        SearchUtils.binarySearch(arr, 2*j);
      } // for

    pen.close();
  } // main(String[])
} // class SearchUtils
