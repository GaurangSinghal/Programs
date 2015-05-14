/* strncpy example */
#include <stdio.h>
#include <string.h>

int main ()
{
  char str1[]= "To be or not to be";
  char str2[]="ass";
  char str3[40];

  /* copy to sized buffer (overflow safe): */
//  strncpy ( str2, str1, sizeof(str2) );

  /* partial copy (only 5 chars): */
  strcat ( str1 );
  //str3[5] = '\0';   /* null character manually added */

  puts (str1);
  puts (str2);
 // puts (str3);

  return 0;
}
