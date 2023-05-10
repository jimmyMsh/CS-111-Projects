# Weather Generator: A Java Library for Weather Forecast Simulations and Analysis

This Java program is an advanced weather forecast generator and analyzer, requiring proficiency in Java programming, data manipulation, statistical analysis, and probability theory. The program generates synthetic time series of weather data for a specific location, based on the statistical characteristics of observed weather at that location. The goal of this project is to showcase how computational techniques can be used in predicting long-range climate patterns, despite the inherent uncertainty in day-to-day weather forecasting.

The program operates by processing two input files containing probabilities of weather transitioning from dry to wet and wet to wet for different months and locations. Please make sure to put the two text files that are included in the same directory as this program.

Key features of the Weather Generator include:

- **Populating location probabilities:** Reads weather data from text files and populates arrays with probabilities for a specific location. 

- **Forecast generation:** Predicts future precipitation patterns for one month using historical probabilities and random numbers.

- **One-month forecast:** Combines previous methods to prepare data and predict weather for an entire month.

- **Number of wet/dry days:** Calculates the number of wet or dry days in a given month's forecast.

- **Length of longest wet/dry spell:** Identifies the longest wet or dry spell in a given month's forecast.

- **Best week to travel:** Determines the 7-day period with the most dry days, which can be useful for travel planning.

The Weather Generator program is ideal for those with intermediate Java experience seeking to apply computational methods to real-world problems, such as long-range weather prediction. It demonstrates the ability to manipulate and analyze complex data sets.
<br>

You can test the program by running the code found in the main method.

To generate the weather for location at longitude -97.59 and latitude 26.72 for the month of January do:
java WeatherGenerator -97.59 26.72 2
