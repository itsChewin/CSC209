/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackqueuelab;

/**
 *
 * @author chewi
 */
public class BigNumber {
    String number; //"32135465486458586541864541541"
    public BigNumber(String number){
        this.number = number;
    }
    public BigNumber(int number){
        this.number = number+"";
    }
    
    public String toString(){
        return this.number;
    }
    public BigNumber add(BigNumber number2){
        String answer="";
        Stack operand1 = new Stack(this.number.length());
        Stack operand2 = new Stack(number2.toString().length());
        String n2 = number2.toString();
        for (int i = 0; i < this.number.length(); i++) {
            operand1.push(this.number.charAt(i)-48);
        }
        for(int i = 0; i< number2.toString().length();i++){
            operand2.push(n2.charAt(i)-48);
        }
        int size;
        size = Math.max(this.number.length(),n2.length())+1;
        Stack result = new Stack(size);
        int carry= 0, a=0;
        while(!operand1.isEmpty() || !operand2.isEmpty()){
            a = (operand1.isEmpty()?0:operand1.pop()) + 
                    (operand2.isEmpty()?0:operand2.pop())
                    +carry;
            result.push(a%10); //if a is 13 => push only 3
            carry = a/10;
        }
        if(carry>0){
            result.push(carry);
        }
        while(!result.isEmpty()){
            answer += result.pop();
        }
        return new BigNumber(answer);
    }
}
