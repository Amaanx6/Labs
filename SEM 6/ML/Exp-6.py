# Experiment – 06
# Implement a Polynomial Regression model using appropriate dataset
# AIM

# To implement a Polynomial regression model using appropriate dataset.

import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

from sklearn.preprocessing import PolynomialFeatures
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error, r2_score


data = {
    "Experience": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
    "Salary": [30000, 35000, 40000, 50000, 65000, 80000, 95000, 120000, 150000, 200000]
}

df = pd.DataFrame(data)

X = df[["Experience"]]
y = df["Salary"]

print("Experience")
print(X.head())

print("Salary")
print(y.head())


X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)

print("X-train")
print(X_train.head())

print("X-test")
print(X_test.head())

print("y-train")
print(y_train.head())

print("y-test")
print(y_test.head())


poly = PolynomialFeatures(degree=2)

X_train_poly = poly.fit_transform(X_train)
X_test_poly = poly.transform(X_test)


model = LinearRegression()
model.fit(X_train_poly, y_train)


y_pred = model.predict(X_test_poly)
print(y_pred)


mse = mean_squared_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)

print("Mean Squared Error:", mse)
print("R2 Score:", r2)


plt.scatter(X, y, color='red')

X_range = np.linspace(1, 10, 100).reshape(-1, 1)
plt.plot(X_range, model.predict(poly.transform(X_range)))

plt.title("Polynomial Regression (Degree 2)")
plt.xlabel("Years of Experience")
plt.ylabel("Salary")

plt.show()  


# 📄 ROUGH WORK + OUTPUTS (UNCHANGED)
# Flow Process
# Start
# Import required libraries
# Load/Create dataset
# Split data into X and y
# Transform features to polynomial features
# Train polynomial regression model
# Predict values
# Evaluate model (MSE, R²)
# Visualize results
# End
# Dataset Sample
# Experience | Salary
# 1          | 30000
# 2          | 35000
# 3          | 40000
# 4          | 50000
# Column Values
# Experience
# 0    1
# 1    2
# 2    3
# 3    4
# 4    5
# Salary
# 0    30000
# 1    35000
# 2    40000
# 3    50000
# 4    65000
# Name: Salary, dtype: int64
# Train-Test Split Output
# X_train
# 5    6
# 0    1
# 7    8
# 2    3
# 9    10
# X_test
# 8    9
# 1    2
# y_train
# 5    80000
# 0    30000
# 7    120000
# 2    40000
# 9    200000
# Name: Salary, dtype: int64
# y_test
# 8    150000
# 1    35000
# Model Output
# LinearRegression()
# Predictions
# [158926.653471654, 33409.412097237]
# Evaluation Metrics
# Mean Squared Error: 4110550.083334126
# R2 Score: 0.9873667127158158