// Isaiah Marshall
// Comp 152 Summer Session II
// Homework 1
// Due 7/20/23 11:59pm

import java.time.LocalDate;
import java.time.LocalTime;

// I've removed the numbers 1, 0, 9, 7, 4
// Try to do them in that order


public class Nums
{
    public static void colon(int size, int line)
    {
        for(int i=0; i<size/2; i++)
            System.out.print(" ");
        if(line==size/3 || line==2*size/3)
            System.out.print("*");
        else
            System.out.print(" ");
        for(int i=size/2+1; i<size; i++)
            System.out.print(" ");

    }
    public static void one(int size, int line) {
//TODO: make a one like this
        /*
         *
         *
         *
         *
         *
         */
        // Want one to be appropriately spaced. Start with left-hand spaces based on size.
        for (int i = 0; i < size / 2; i++)
        {
            System.out.print(" ");
        }
        // The one itself is just a star per line.
        System.out.print("*");
        // Finally, need right-hand spaces based on variable size to make it properly centered.
        for (int i = size / 2 + 1; i < size; i++)
        {
            System.out.print(" ");
        }
    }
    public static void zero(int size, int line) {
    //TODO: make a zero like this:
        /*
         *****
         *   *
         *   *
         *   *
         *****
         */
        // first line: draw stars until we're at variable size
        if(line==0) {
            for (int i = 0; i < size; i++) {
                System.out.print("*");
            }
        }
        // last line: draw stars until we're at variable size
        else if(line==size-1) {
            for (int i = 0; i < size; i++) {
                System.out.print("*");
            }
        }
        // every line in between: start with star, then spaces until size-2, then star
        else if(line>=1 && line<=size-2) {
            System.out.print("*");
            for (int i = 0; i < size-2; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

    }
    public static void six(int size, int line)
    {
        // Start with horizontal line of stars based on variable size.
        // First line position only.
        if(line==0) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
        // Then we want star with spaces after based on variable size.
        // Goes until one before middle line position.
        else if (line>=1 && line<size/2) {
            System.out.print("*");
            for(int i=0; i<size-1; i++)
                System.out.print(" ");
        }
        // Then we want another horizontal line based on variable size.
        // Only occurs in middle line position.
        else if (line==size/2) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
        // Then we want one star, spaces with length size-2, then a final star.
        // Goes until one before final line position.
        else if (line>size/2 && line<size-1) {
            System.out.print("*");
            for(int i=0; i<size-2; i++)
                System.out.print(" ");
            System.out.print("*");
        }
        // Finally, we want one more horizontal line based on variable size.
        // Only occurs in final line position.
        else if (line==size-1) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
    }
    public static void nine(int size, int line) {
//TODO: Make a 9 like this
        /*
         *****
         *   *
         *****
             *
         *****
         */
//hint: look at the 6
        // First we want a row of starts based on variable size.
        // This is only for the first line position.
        if(line==0) {
            for (int i=0; i<size; i++) {
                System.out.print("*");
            }
        }
        // Then we want a single star, a series of spaces until size-2, and then another star.
        // This starts at the second line position and stops one line before we're halfway done vertically.
        else if(line>0 && line<size/2) {
            System.out.print("*");
            for(int i=0; i<size-2; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        // For exclusively the middle line, we want another row of stars based on variable size.
        else if(line==size/2) {
            for (int i=0; i<size; i++) {
                System.out.print("*");
            }
        }
        // Then we want a series of spaces until size-1, followed by a star.
        // This starts at line position size/2+1, and continues until size-2.
        else if(line>size/2 && line<size-1) {
            for(int i=0; i<size-1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        // Finally, we want another of stars based on variable size.
        else if(line==size-1) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
    }
    public static void eight(int size, int line)
    {
        if(line==0) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
        else if (line<size-1 && line!=size/2){
            System.out.print("*");
            for (int i=0; i<size-2; i++)
                System.out.print(" ");
            System.out.print("*");
        }
        else if (line==size/2)
        {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
        else if (line==size-1)
        {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
    }
    public static void two(int size, int line)
    {
        if(line==0) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        } else if (line>=1 && line<size/2) {
            for(int i=0; i<size-1; i++)
                System.out.print(" ");
            System.out.print("*");
        } else if (line==size/2) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        } else if (line>size/2 && line<size-1) {
            System.out.print("*");
            for(int i=0; i<size-1; i++)
                System.out.print(" ");
        } else if (line==size-1) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
    }
    public static void five(int size, int line)
    {
        if(line==0) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        } else if (line>=1 && line<size/2) {
            System.out.print("*");
            for(int i=0; i<size-1; i++)
                System.out.print(" ");
        } else if (line==size/2) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        } else if (line>size/2 && line<size-1) {
            for(int i=0; i<size-1; i++)
                System.out.print(" ");
            System.out.print("*");
        } else if (line==size-1) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
    }
    public static void seven(int size, int line)
    {
//TODO: Make a 7 with a diagonal

        /*
         *****
         *
         *
         *
         *
         */
        // First we want a row of starts based on variable size.
        // This is only for the first line position.
        if(line==0) {
            for (int i=0; i<size; i++) {
                System.out.print("*");
            }
        }
        // For all remaining lines, we want a series of spaces equal to size-line.
        if(line>0 && line<=size-1) {
            for (int i=0; i<size-line; i++) {
                System.out.print(" ");
            }
        // Then we want a star to print.
            System.out.print("*");
        // Finally, we want more spaces until the characters hit
            for (int i=size-line+1; i<size; i++) {
                System.out.print(" ");
            }
        }
    }
    public static void four(int size, int line)
    {
//TODO: Make a 4

        /*
         *   *
         *   *
         *****
         *
         *
         */
// for bonus, try doing a diagonal
        /*
         *
         * *
         *****
         *
         *
         */
        // Then we want a single star, a series of spaces until size-2, and then another star.
        // This starts at the first line position and stops one line before we're halfway done vertically.
        if(line>=0 && line<size/2) {
            System.out.print("*");
            for (int i=0; i<size-2; i++) {
                System.out.print(" ");
            }
                System.out.print("*");
        }
        // For the middle line position, we just want a row of stars until size.
        else if(line==size/2) {
            for(int i=0; i<size; i++) {
                System.out.print("*");
            }
        }
        // For the remainder of the line positions, we just want a series of spaces until size-1, then another star.
        else if(line>=size/2 && line<=size-1) {
            for(int i=0; i<size-1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }
    public static void three(int size, int line)
    {
        if(line==0) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        } else if (line>=1 && line<size/2) {
            for(int i=0; i<size-1; i++)
                System.out.print(" ");
            System.out.print("*");
        } else if (line==size/2) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        } else if (line>size/2 && line<size-1) {
            for(int i=0; i<size-1; i++)
                System.out.print(" ");
            System.out.print("*");
        } else if (line==size-1) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
    }
    public static void space(int size)
    {
        for(int i=0; i<size/2; i++)
            System.out.print(" ");
    }
    public static void printnums(int[] nums, int size, boolean border)
    {
        if(border) {
            for (int i = 0; i<(size+size/2)*nums.length+size/2+2; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int line=0; line<size; line++) {
            if(border) {
                System.out.print("*");
                space(size);
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0)
                    zero(size,line);
                else if (nums[i]==1)
                    one(size,line);
                else if (nums[i]==2)
                    two(size,line);
                else if (nums[i]==3)
                    three(size,line);
                else if (nums[i]==4)
                    four(size,line);
                else if (nums[i]==5)
                    five(size,line);
                else if (nums[i]==6)
                    six(size,line);
                else if (nums[i]==7)
                    seven(size,line);
                else if (nums[i]==8)
                    eight(size,line);
                else if (nums[i]==9)
                    nine(size,line);
                else if (nums[i]==-1)
                    colon(size,line);
                space(size);
            }
            if(border)
                System.out.print("*");
            System.out.println();
        }
        if(border) {
            for (int i = 0; i<(size+size/2)*nums.length+size/2+2; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int[] toarrayfixed(int num)
    {
        int[] d=new int[2];
        d[0]=num/10;
        d[1]=num%10;
        return d;
    }
    public static int[] toarray(int num)
    {
        int n=num;
        int count=0;
        while(n!=0) {
            n = n / 10;
            count++;
        }
        int[] d=new int[count];
        for(int i=0; i<count; i++) {
            d[d.length - 1 - i] = num % 10;
            num = num / 10;
        }
        return d;
    }
    public static void printtime(int size)
    {
        int[] h=toarray(LocalTime.now().getHour());
        int[] m=toarrayfixed(LocalTime.now().getMinute());
        int[] s=toarrayfixed(LocalTime.now().getSecond());
        int[] t=new int[h.length+m.length+s.length+2];
        int c=0;
        for(int i=0; i<h.length; i++) {
            t[c] = h[i];
            c++;
        }
        t[c]=-1;
        c++;
        for(int i=0; i<m.length; i++) {
            t[c] = m[i];
            c++;
        }
        t[c]=-1;
        c++;
        for(int i=0; i<s.length; i++) {
            t[c] = s[i];
            c++;
        }
        printnums(t,size,true);
    }
    public static void main(String[] args)
    {
        while(true) {
            printtime(8);
            try{Thread.sleep(1000);}catch(InterruptedException e){}
        }
    }
}