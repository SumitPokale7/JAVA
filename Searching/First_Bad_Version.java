// //https://leetcode.com/problems/first-bad-version/

// // First_Bad_Version

// public class First_Bad_Version {

// public static void main(String[] args) {

// }

// public class Solution extends VersionControl {
// public int firstBadVersion(int n) {
// int Start = 0;
// int End = n-1;
// while(Start<=End){
// int Mid = Start + (End - Start) /2 ;
// if(isBadVersion(Mid) == true &&(isBadVersion(Mid-1)== false || Mid == 1)){
// return Mid;
// }else if(isBadVersion(Mid)==true &&(isBadVersion(Mid -1)==true)){
// End = Mid - 1;
// }else if(isBadVersion(Mid )==false){
// Start = Mid + 1;
// }
// }
// return n;
// }
// }
// }