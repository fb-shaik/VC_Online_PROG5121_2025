/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petpersonalitymatcher;

 // Pet class encapsulates the logic for pet recommendation
  class Pet {
        // Private variable to store the recommendation
        private String recommendation;

        /**
         * This method sets the pet recommendation based on the user's activity level
         * and preference for indoor or outdoor settings.
         *
         * @param activity   User's activity level: "active" or "lazy"
         * @param preference User's preference: "indoor" or "outdoor"
         */
        public void setRecommendation(String activity, String preference) {
            // Convert inputs to lowercase for consistency
            activity = activity.toLowerCase();
            preference = preference.toLowerCase();

            // Use if-else statements to determine the pet recommendation
            if (activity.equals("active") && preference.equals("outdoor")) {
                recommendation = "You should get a dog!";
            } else if (activity.equals("active") && preference.equals("indoor")) {
                recommendation = "You might enjoy an energetic cat or a rabbit!";
            } else if (activity.equals("lazy") && preference.equals("indoor")) {
                recommendation = "A calm cat or a fish would be perfect for you.";
            } else if (activity.equals("lazy") && preference.equals("outdoor")) {
                recommendation = "Consider a low-maintenance pet like a turtle.";
            } else {
                // Catch-all for unexpected input
                recommendation = "Sorry, we couldn't determine a match. Try again!";
            }
        }

        /**
         * This method returns the recommendation string.
         *
         * @return pet recommendation
         */
        public String getRecommendation() {
            return recommendation;
        }
    }