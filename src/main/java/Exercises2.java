import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercises2 
{

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    */

	public int[] twoSum(int[] nums, int target) 
    {
    	int[] answers = {0, 0};
    	for (int i = 0; i < nums.length-1; i++)
    	{
    		for (int k = i+1; k < nums.length; k++)
    		{
    			if (nums[i] + nums[k] == target)
    			{
    				answers[0] = i;
    				answers[1] = k;
    				break;
    			}
    		}
    	}
        // TODO
        return answers;
    }

    /*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    For example, 2 is written as II in Roman numeral, just two ones added together.
    12 is written as XII, which is simply X + II.
    The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right.
    However, the numeral for four is not IIII.
    Instead, the number four is written as IV.
    Because the one is before the five we subtract it making four.
    The same principle applies to the number nine, which is written as IX.
    There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

    Given a roman numeral, convert it to an integer.
    */

    public int romanToInt(String str) 
    {
        // TODO
    	int answer = 0;
    	for (int i = 0; i < str.length(); i++)
    	{
    		if (str.charAt(i) == 'I')////////////////////////////////////////////////////////////////
    		{
    			if (i < str.length()-1)
    			{
    				if (str.charAt(i+1) == 'V')
    				{
    					answer = answer + 4;
    					i++;
    					continue;
    				}
    				else if (str.charAt(i+1) == 'X')
    				{
    					answer = answer + 9;
    					i++;
    					continue;
    				}
    				else
    				{
    				    answer = answer + 1;
    				}
    			}
    			else
    			{
    				answer = answer + 1;
    			}
    		}
    		else if (str.charAt(i) == 'V')////////////////////////////////////////////////////////////////
    		{
    			answer = answer + 5;
    		}
    		else if (str.charAt(i) == 'X')////////////////////////////////////////////////////////////////
    		{
    			if (i < str.length()-1)
    			{
    				if (str.charAt(i+1) == 'L')
    				{
    					answer = answer + 40;
    					i++;
    					continue;
    				}
    				else if (str.charAt(i+1) == 'C')
    				{
    					answer = answer + 90;
    					i++;
    					continue;
    				}
    				else
        			{
        				answer = answer + 10;
        			}
    			}
    			else
    			{
    				answer = answer + 10;
    			}
    		}
    		else if (str.charAt(i) == 'L')////////////////////////////////////////////////////////////////
    		{
    			answer = answer + 50;
    		}
    		else if (str.charAt(i) == 'C')////////////////////////////////////////////////////////////////
    		{
    			if (i < str.length()-1)
    			{
    				if (str.charAt(i+1) == 'D')
    				{
    					answer = answer + 400;
    					i++;
    					continue;
    				}
    				else if (str.charAt(i+1) == 'M')
    				{
    					answer = answer + 900;
    					i++;
    					continue;
    				}
    			    else
        			{
        				answer = answer + 100;
        			}
    			}
    			else
    			{
    				answer = answer + 100;
    			}
    		}
    		else if (str.charAt(i) == 'D')////////////////////////////////////////////////////////////////
    		{
    			answer = answer + 500;
    		}
    		else if (str.charAt(i) == 'M')////////////////////////////////////////////////////////////////
    		{
    			answer = answer + 1000;
    		}
    	}
        return answer;
    }

    /*
    Given an array nums of distinct integers, return all the possible permutations.
    You can return the answer in any order.
    */

    public List<List<Integer>> permute(int[] nums) 
    {
        // TODO
        return null;
    }

    public static void main(String[] args) 
    {
        // test your code here!
    }
}