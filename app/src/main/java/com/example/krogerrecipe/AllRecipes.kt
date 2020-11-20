package com.example.krogerrecipe

import java.util.ArrayList

class AllRecipes {
    companion object {
        var list : ArrayList<RecipeData> = arrayListOf(
            RecipeData("Perfect Roasted Turkey", "This recipe is a holiday staple!", "DirectionsInstructions Checklist\n" +
                    "Step 1\n" +
                    "Preheat oven to 325 degrees F (165 degrees C). Place rack in the lowest position of the oven.\n" +
                    "\n" +
                    "Step 2\n" +
                    "Remove the turkey neck and giblets, rinse the turkey, and pat dry with paper towels. Place the turkey, breast side up, on a rack in the roasting pan. Loosely fill the body cavity with stuffing. Rub the skin with the softened butter, and season with salt and pepper. Position an aluminum foil tent over the turkey.","6.5", R.drawable.recipe1),
            RecipeData("Cast Iron Steaks with Herb Butter", "We chose the moderately expensive boneless strip steak for its big, beefy flavor.", "Sprinkle entire surface of each steak with 1 teaspoon salt. Let sit at room temperature for at least 30 minutes and up to 1 hour.\n" +
                    "\n" +
                    "2\n" +
                    "Adjust oven rack to middle position, place 12-inch cast-iron skillet on rack, and heat oven to 500 degrees. Combine butter, shallot, parsley, chives, garlic, and 1/4 teaspoon pepper in bowl; set aside.\n" +
                    "\n" +
                    "3\n" +
                    "When oven reaches 500 degrees, pat steaks dry with paper towels and season with pepper. Using potholders, remove skillet from oven and place over medium-high heat; turn off oven. Being careful of hot skillet handle, add oil and heat until just smoking. Cook steaks, without moving them, until lightly browned on first side, about 2 minutes. Flip steaks and cook until lightly browned on second side, about 2 minutes.\n" +
                    "\n" +
                    "4\n","3.5", R.drawable.recipe2),
            RecipeData("Hamburgers", "Get Hamburgers Recipe from Food Network","Preheat the oven to 450 degrees F. Place a roasting rack on a foil-lined baking sheet in the oven.\n" +
                    "Using your hands, break the meat into small pieces and combine evenly but loosely on a parchment or waxed paper-lined baking sheet. Spread the meat out and season it generously with salt and pepper. If desired, add the spice mix at this time.\n" +
                    "Divide the meat into 4 portions (about 6 ounces each). Using your hands, form each portion into a ball-shape by gently tossing it from 1 hand to the other. (Don't over work or press too firmly on the meat.) Gently form each portion into a patty about 3 1/2 inches wide and 1-inch-thick.", "5.0", R.drawable.recipe3),
            RecipeData("Spaghetti", "Easy Weeknight Spaghetti with Meat Sauce","Check the package directions of the spaghetti you plan to cook. On the box, there should be an approximate cook time for “al-dente,” which means the pasta will be tender, but not mushy. It will still have a bit of a bite, which is perfect.\n" +
            "When you know the suggested cook time, set a timer for a minute or so before it. So if the box suggests 10 minutes, set a timer for 8 minutes. This way, at the 8-minute mark, you can check on the spaghetti to make sure it isn’t done already. The box directions are a helpful guide, but it’s always a good idea to check the pasta early!\n" +
            "Cook the spaghetti in salted water. The water should taste salty. This seasons the pasta as it cooks and is necessary for the best-tasting pasta.", "2.0", R.drawable.recipe4)
        )
    }
}