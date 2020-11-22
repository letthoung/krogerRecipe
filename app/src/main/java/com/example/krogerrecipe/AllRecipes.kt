package com.example.krogerrecipe

import java.util.ArrayList

class AllRecipes {
    companion object {
        var list : ArrayList<RecipeData> = arrayListOf(
            RecipeData("Perfect Roasted Turkey", "This recipe is a holiday staple!", "Choose the right size turkey. \n" +
                    "\n" +
                    "Buy about 1 1/4 lb. turkey per person. We have an easy-to-read chart so you don't have to read through an annoyingly long article while shopping for your turkey.\n" +
                    "\n" +
                    "Adjust the cook time based on the size of your bird. \n" +
                    "\n" +
                    "A 12- to 14-lb. turkey needs 3 to 4 hours in the oven. But an 8-pounder will likely only need 2 hours 45 minute. The cook time depends on a number of things, including whether or not the bird is stuffed (this recipe isn't), how big it is, and if it has been thawed. According to the USDA, a frozen turkey requires about fifty perfect more time in the oven than a fully thawed turkey. Find out exactly how long yours needs with our turkey cook time chart.\n" +
                    "\n" +
                    "Bring the turkey to room temperature. \n" +
                    "\n" +
                    "While the oven is preheating, bring your bird to room temperature. This ensures even cooking.\n" +
                    "\n" +
                    "Use a roasting rack. \n" +
                    "\n" +
                    "Though you don't technically need one, a roasting racks allows the air to circulate around the bottom of your turkey in the oven, which means that soggy skin is way less of a risk.\n" +
                    "\n" +
                    "Start with a super hot oven, then reduce the temperature. \n" +
                    "\n" +
                    "We like to blast the turkey with extremely hot heat (450°) for the first 30 minutes to get the skin really crispy, then we drop the temp to 350º so that it doesn't burn.\n" +
                    "\n" +
                    "Use more butter than you feel comfortable with. \n" +
                    "\n" +
                    "Before the bird goes in the oven and while it roasts, add A LOT of butter. It's key for crispy, flavorful, golden skin.","6.5", R.drawable.recipe1),

            RecipeData("Cast Iron Steaks with Herb Butter", "We chose the moderately expensive boneless strip steak for its big, beefy flavor.", "INSTRUCTIONS\n" +
                    "\n" +
                    "1\n" +
                    "Sprinkle entire surface of each steak with 1 teaspoon salt. Let sit at room temperature for at least 30 minutes and up to 1 hour.\n" +
                    "\n" +
                    "2\n" +
                    "Adjust oven rack to middle position, place 12-inch cast-iron skillet on rack, and heat oven to 500 degrees. Combine butter, shallot, parsley, chives, garlic, and 1/4 teaspoon pepper in bowl; set aside.\n" +
                    "\n" +
                    "3\n" +
                    "When oven reaches 500 degrees, pat steaks dry with paper towels and season with pepper. Using potholders, remove skillet from oven and place over medium-high heat; turn off oven. Being careful of hot skillet handle, add oil and heat until just smoking. Cook steaks, without moving them, until lightly browned on first side, about 2 minutes. Flip steaks and cook until lightly browned on second side, about 2 minutes.\n" +
                    "\n" +
                    "4\n" +
                    "Flip steaks, reduce heat to medium-low, and cook, flipping every 2 minutes, until steaks are well browned and meat registers 120 to 125 degrees (for medium-rare), 7 to 9 minutes. Transfer steaks to carving board, dollop 2 tablespoons herb butter on each steak, tent with aluminum foil, and let rest for 5 to 10 minutes. Slice steaks 1/2 inch thick and serve.","3.5", R.drawable.recipe2),
            RecipeData("Hamburgers", "Get Hamburgers Recipe from Food Network","DirectionsInstructions Checklist\n" +
                    "Step 1\n" +
                    "Preheat grill for high heat.\n" +
                    "\n" +
                    "Step 2\n" +
                    "In a large bowl, mix the ground beef, egg, bread crumbs, evaporated milk, Worcestershire sauce, cayenne pepper, and garlic using your hands. Form the mixture into 8 hamburger patties.\n" +
                    "\n" +
                    "Step 3\n" +
                    "Lightly oil the grill grate. Grill patties 5 minutes per side, or until well done.", "5.0", R.drawable.recipe3),
            RecipeData("Spaghetti", "Easy Weeknight Spaghetti with Meat Sauce","Instructions\n" +
                    "Step 1\n" +
                    "Combine ground beef, onion, garlic, and green pepper in a large saucepan. Cook and stir until meat is brown and vegetables are tender. Drain grease.\n" +
                    "\n" +
                    "Step 2\n" +
                    "Stir diced tomatoes, tomato sauce, and tomato paste into the pan. Season with oregano, basil, salt, and pepper. Simmer spaghetti sauce for 1 hour, stirring occasionally.", "2.0", R.drawable.recipe4)
        )
    }
}