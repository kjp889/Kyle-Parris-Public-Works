#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// Function to check if a character is a lambda
int is_lambda(char c) {
    printf("lam");
  return c == '#';
}

// Function to find the variable name after lambda
char* get_lambda_var(char* expr) {
  char* var_start = expr + 1;
  while (*var_start != '.' && *var_start != '\0') {
    var_start++;
  }
  if (*var_start == '\0') {
    return NULL; // Not a valid lambda expression
  }
  *var_start = '\0'; // Terminate the variable string
  return var_start + 1;
}

// Function to perform beta reduction (single variable case)
char* beta_reduce(char* expr) {
  if (!is_lambda(expr[0])) {
    return expr; // Not a lambda expression
  }

  char* var = get_lambda_var(expr);
  if (var == NULL) {
    return expr; // Invalid lambda expression
  }

  // Find the argument (everything after the dot)
  char* arg_start = strchr(expr, '.') + 1;
  if (arg_start == NULL) {
    return expr; // No argument provided
  }

  // Search for occurrences of the variable and substitute with the argument
  char* iter = expr;
  while ((iter = strstr(iter, var))) {
     int len_arg = strlen(arg_start);
     // Check if the substitution is within another lambda (not within parentheses)
    if (iter == expr || !is_lambda(*(iter-1))) {
      // Not within another lambda, perform substitution
      int len_var = strlen(var);
      int len_arg = strlen(arg_start);
      memmove(iter + len_arg, iter + len_var, strlen(iter + len_var) + 1);
      memcpy(iter, arg_start, len_arg);
    }
    iter += len_arg; // Move to the next character after the substitution
  }

  // Free the memory allocated for the variable (optional)
  free(var);

  return expr;
}

int main() {
  char expr[100];
  printf("Enter a lambda calculus expression: ");
  fgets(expr, 100, stdin);

  // Remove trailing newline character
  expr[strcspn(expr, "\n")] = '\0';

  char* reduced_expr = beta_reduce(expr);
  printf("Reduced expression: %s\n", reduced_expr);

  return 0;
}
