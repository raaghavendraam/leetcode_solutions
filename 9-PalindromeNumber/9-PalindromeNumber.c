// Last updated: 04/04/2026, 15:48:12
bool isPalindrome(int x) {
   double tem=0,rem; int rev=x;
   while(rev>0){
    rem=rev%10;
    tem= tem * 10 + rem;
    rev/=10;
   }
   return (tem==x);
}