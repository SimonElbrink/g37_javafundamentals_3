package se.lexicon.simon;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //mySortExample();
        //myBinarySearchExample();
        //myCopyOfExpand();
        //reference();
        //myToStringExample();
        myArrayCombiningExample();

    }

    public static void mySortExample(){

        String[] names = {"Simon", "Erik", "Ulf", "kent", "Mehrdad"};

        System.out.println(Arrays.toString(names));

        //names = Arrays.sort(names);
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        System.out.println(Arrays.toString(names));
    }


    public static void myBinarySearchExample(){
        String[] names = {"Simon", "Erik", "Ulf","Ulf", "kent", "Mehrdad"};

        System.out.println("Before sorted: " + Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("After sorted: " + Arrays.toString(names));

        String nameToFind = "Simon";

        int foundAtIndex = Arrays.binarySearch(names, nameToFind);

        System.out.println(nameToFind + " Was found at Index: " + foundAtIndex);

    }

    public static void myCopyOfExpand(){
        String[] names = {"Simon", "Erik", "Ulf", "kent", "Mehrdad"};

        System.out.println("Original Array: " + Arrays.toString(names));

        names = Arrays.copyOf(names, names.length + 1);

        System.out.println("Copied Array, before adding: " + Arrays.toString(names));

        names[5] = "Theresia";

        System.out.println("Copied Array, after adding: " + Arrays.toString(names));

    }

    public static void reference(){

        char[] letters = {'J', 'A', 'V', 'A'};

        char[] notACopy = letters;

        char[] realCopy = Arrays.copyOf(letters, letters.length);


        System.out.println("for-loop");
        for (int i = letters.length; i < letters.length -1; i--) {
            System.out.println(letters[i]);
        }

        System.out.println("E-for-loop");
        for (char letter: letters) {
            System.out.println(letter);
        }
    }

    public static void myToStringExample(){
        String[] names = {"Simon", "Erik", "Ulf", "kent", "Mehrdad"};
        System.out.println(names);


        System.out.println("Arrays.toString(names): " + Arrays.toString(names));

    }

    public static void myArrayCombiningExample(){


        String[] names = {"Simon", "Erik", "Ulf", "Kent", "Mehrdad"};
        String[] moreNames ={"Marcus", "Theresia", "Julius", "Fredrik"};

        String[] combinedNames = arrayCombiner(names, moreNames);

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(moreNames));
        System.out.println(Arrays.toString(combinedNames));
    }

    /**
     * This Method combines two String arrays.
     * Adding all to a new Array
     * @param source
     * @param elementsToAdd
     * @return the combined array. (source + elementsToAdd)
     */
    public static String[] arrayCombiner(String[] source, String[] elementsToAdd){

        //new length of source + elementsToAdd (5 + 4 = 9)
        String[] combinedNames = Arrays.copyOf(source,source.length + elementsToAdd.length);

        //i Where to add. J What to add.
        for (int i = source.length, j = 0; i < combinedNames.length; i++, j++){
            combinedNames[i] = elementsToAdd[j];
        }

        return combinedNames;
    }

}
