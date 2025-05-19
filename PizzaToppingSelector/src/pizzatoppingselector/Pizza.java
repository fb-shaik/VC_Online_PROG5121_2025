/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzatoppingselector;

 // Pizza class to encapsulate the topping logic
    class Pizza {
        // Private variable to store the selected topping
        private String topping;

        /**
         * Sets the pizza topping based on user's numeric choice using a switch statement.
         *
         * @param choice The number input by the user (1 to 4)
         */
        public void setTopping(int choice) {
            // Switch statement to map each number to a specific topping
            switch (choice) {
                case 1:
                    topping = "Pepperoni";
                    break;
                case 2:
                    topping = "Mushroom";
                    break;
                case 3:
                    topping = "Pineapple";
                    break;
                case 4:
                    topping = "Cheese";
                    break;
                default:
                    // Handles invalid input (not 1–4)
                    topping = "Invalid choice. No topping selected.";
                    break;
            }
        }

        /**
         * Returns the selected topping.
         *
         * @return The topping selected or error message
         */
        public String getTopping() {
            return topping;
        }
    }