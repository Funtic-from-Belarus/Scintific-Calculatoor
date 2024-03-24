package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView signbox, input, solution;

    String sign, value1, value2;
    Double num1, num2, result;
    boolean hasDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signbox = (TextView) findViewById(R.id.sign);
        input = (TextView) findViewById(R.id.input);
        solution = (TextView) findViewById(R.id.solution);
        hasDot = false;
    }

    public void btnClick_0(View view) {
        if(solution.getText().toString().contains("=")) btnClick_clear(view);
        if (input.getText().equals("0")) {
            input.setText(input.getText() + "");
        } else {
            input.setText(input.getText() + "0");
        }
    }

    public void btnClick_1(View view) {
        if(solution.getText().toString().contains("=")) btnClick_clear(view);
        input.setText(input.getText() + "1");
        solution.setText(solution.getText() + "1");
    }

    public void btnClick_2(View view) {
        if(solution.getText().toString().contains("=")) btnClick_clear(view);
        input.setText(input.getText() + "2");
        solution.setText(solution.getText() + "2");
    }

    public void btnClick_3(View view) {
        if(solution.getText().toString().contains("=")) btnClick_clear(view);
        input.setText(input.getText() + "3");
        solution.setText(solution.getText() + "3");
    }

    public void btnClick_4(View view) {
        if(solution.getText().toString().contains("=")) btnClick_clear(view);
        input.setText(input.getText() + "4");
        solution.setText(solution.getText() + "4");
    }

    public void btnClick_5(View view) {
        if(solution.getText().toString().contains("=")) btnClick_clear(view);
        input.setText(input.getText() + "5");
        solution.setText(solution.getText() + "5");
    }

    public void btnClick_6(View view) {
        if(solution.getText().toString().contains("=")) btnClick_clear(view);
        input.setText(input.getText() + "6");
        solution.setText(solution.getText() + "6");
    }

    public void btnClick_7(View view) {
        if(solution.getText().toString().contains("=")) btnClick_clear(view);
        input.setText(input.getText() + "7");
        solution.setText(solution.getText() + "7");
    }

    public void btnClick_8(View view) {
        if(solution.getText().toString().contains("=")) btnClick_clear(view);
        input.setText(input.getText() + "8");
        solution.setText(solution.getText() + "8");
    }

    public void btnClick_9(View view) {
        if(solution.getText().toString().contains("=")) btnClick_clear(view);
        input.setText(input.getText() + "9");
        solution.setText(solution.getText() + "9");
    }

    public void btnClick_dot(View view) {
        if (!hasDot) {
            if (input.getText().equals("")) {

                input.setText("0.");
                solution.setText("0.");
            } else {

                input.setText(input.getText() + ".");
                solution.setText(solution.getText() + ".");
            }

            hasDot = true;
        }
    }

    public void btnClick_add(View view) {
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("+");
        String solution1 = solution.getText().toString();
        if (solution1.endsWith("+")) {
            solution.setText(solution.getText() + "");
        } else if (solution1.endsWith("-") || solution1.endsWith("×") || solution1.endsWith("÷")){
            //String solution2 = solution.getText().toString();
            //int index = solution2.indexOf("=");
            //value1 = solution.getText().toString().substring(index, solution.length() - 1);
            solution.setText(solution.getText().toString().substring(0, solution.length() - 1));
            value1 = solution.getText().toString();
            solution.setText(solution.getText() + "+");
        } else{
            solution.setText(solution.getText() + "+");
        }
        hasDot = false;
    }

    public void btnClick_substract(View view) {
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("-");
        String solution1 = solution.getText().toString();
        if (solution1.endsWith("-")) {
            solution.setText(solution.getText() + "");
        } else if(solution1.endsWith("+") || solution1.endsWith("×") || solution1.endsWith("÷")) {
            //String solution2 = solution.getText().toString();
            //int index = solution2.indexOf("=");
            //value1 = solution.getText().toString().substring(index, solution.length() - 1);
            solution.setText(solution.getText().toString().substring(0, solution.length() - 1));
            value1 = solution.getText().toString();
            solution.setText(solution.getText() + "-");
        } else {
            solution.setText(solution.getText() + "-");
        }
        hasDot = false;
    }

    public void btnClick_multiply(View view) {
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("×");
        String solution1 = solution.getText().toString();
        if (solution1.endsWith("×")) {
            solution.setText(solution.getText() + "");
        } else if(solution1.endsWith("+") || solution1.endsWith("-") || solution1.endsWith("÷")) {
            //String solution2 = solution.getText().toString();
            //int index = solution2.indexOf("=");
            //value1 = solution.getText().toString().substring(index, solution.length() - 1);
            solution.setText(solution.getText().toString().substring(0, solution.length() - 1));
            value1 = solution.getText().toString();
            solution.setText(solution.getText() + "×");
        } else{
            solution.setText(solution.getText() + "×");
        }
        hasDot = false;
    }

    public void btnClick_divide(View view) {
        sign = "/";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("÷");
        String solution1 = solution.getText().toString();
        if (solution1.endsWith("÷")) {
            solution.setText(solution.getText() + "");
        } else if(solution1.endsWith("+") || solution1.endsWith("×") || solution1.endsWith("-")) {
            //String solution2 = solution.getText().toString();
            //int index = solution2.indexOf("=");
            //value1 = solution.getText().toString().substring(index, solution.length() - 1);
            solution.setText(solution.getText().toString().substring(0, solution.length() - 1));
            value1 = solution.getText().toString();
            solution.setText(solution.getText() + "÷");

        } else {
            solution.setText(solution.getText() + "÷");
        }
        hasDot = false;
    }

    public void btnClick_equal(View view) {
        if (sign == null) {
            signbox.setText("Error!");
        } else if (input.getText().equals("")) {
            signbox.setText("Error!");
        } else if ((sign.equals("+") && value1.equals("")) || (sign.equals("-") && value1.equals("")) || (sign.equals("*") && value1.equals("")) || (sign.equals("/")&& value1.equals("")) ) {
            signbox.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "+":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    solution.setText(num1 + "+" + num2 + "=" + result);
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    hasDot = true;
                    break;
                case "-":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    solution.setText(num1 + "-" + num2 + "=" + result);
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    hasDot = true;
                    break;
                case "*":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    solution.setText(num1 + "×" + num2 + "=" + result);
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    hasDot = true;
                    break;
                case "/":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    if (num2 == 0) {
                        signbox.setText("Error!");
                    } else {
                        result = num1 / num2;
                        solution.setText(num1 + "÷" + num2 + "=" + result);
                        input.setText(result + "");
                        sign = null;
                        signbox.setText(null);
                        hasDot = true;
                    }

                    break;
            }

        }
    }


    public void btnClick_delete(View view) {
        if (input.getText().equals("")) {
            input.setText(null);
            solution.setText(null);
        } else {
            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                hasDot = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));

            } else {
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
                solution.setText(solution.getText().subSequence(0, solution.getText().length() - 1));

            }
        }
    }

    public void btnClick_clear(View view) {
        input.setText(null);
        solution.setText(null);
        signbox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;
    }
}