
package sandwhich_app;

public class Sandwich {
   private StringBuilder contents; // Holds full sandwich name
   private StringBuilder sandwichID; // Holds first-letter code (sandwich ID)
   private int count; // Tracks number of ingredients

    public Sandwich() {
        contents = new StringBuilder("Your Sandwich: ");
        sandwichID = new StringBuilder();
        count = 0;
    }
    
     /**
     * Adds a valid ingredient to the sandwich.
     * Returns true if added, false if invalid.
     */
    public boolean addIngredient(String ingredient )
    {
        switch(ingredient)
        {
            case "lettuce":
            case "cheese":
            case "tomatoe":
            case "chicken":
            case "mayo":
                        String formatted = capitalize(ingredient);
                        contents.append(formatted).append( " + ");
                        sandwichID.append(formatted.charAt(0)); // Add first letter to ID
                        count ++;
                        return true;
            default:
                return false;
        }
    }
        
        /**
     * Capitalizes the first letter of a word.
     */
        private String capitalize(String word)
        {
            if( word == null || word.isEmpty()) return word;
            return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        
        }
        
         /**
     * Returns a summary of the sandwich with count and ID.
     */
    public String getSummary() {
        // Clean trailing " + " if any
        if (contents.toString().endsWith(" + ")) {
            contents.setLength(contents.length() - 3);
        }
        contents.append("\nTotal ingredients: ").append(count);
        contents.append("\nSandwich ID: ").append(sandwichID.toString());
        return contents.toString();
    }
}
  
    
    
   
