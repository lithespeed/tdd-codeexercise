package main.com.wordwrap;

public class WordWrapper {
    public String wrap(String input, int rowLength) {
        if(input.length() > rowLength) {
            return input.substring(0, rowLength) + "\n" + wrap(input.substring(rowLength, input.length()), rowLength);
        } else {
            return input;
        }
    }


















    /*
    public String wrap(String input, int rowLength) {
        if(input.length() > rowLength) {
            return input.substring(0, rowLength) + "\n" + wrap(input.substring(rowLength, input.length()), rowLength);
        } else {
            return input;
        }
    }
    */






























    /*
    public String wrapIt(String input, int rowLength) {

        if(input.length() > rowLength) {
            return input.substring(0, rowLength) + "\n" + wrapIt(input.substring(rowLength, input.length()), rowLength);
        } else {
            return input;
        }
    }
    */





























    /*
    public String wrapString(String input, int rowLength) {

        if(input.length() > rowLength) {
            return input.substring(0, rowLength) + "\n" + wrapString(input.substring(rowLength, input.length()), rowLength);
        } else {
            return input;
        }
    }
    */


















    /*
    public String wrap(String input, int rowLength) {

        if(input.length() <= rowLength)
            return input;
        else {
            return input.substring(0, rowLength) + "\n" + wrap(input.substring(rowLength, input.length()), rowLength);
        }
    }
    */






































    /*
    public static String wrap(String input, int rowLength) {

        if (input.length() <= rowLength)
            return  input;
        else {
            return input.substring(0, rowLength) + "\n" + wrap(input.substring(rowLength, input.length()), rowLength);
        }
    }
    */

    /* Wrap - once
    public String wrap(String input, int rowLength) {

        if (input.length() <= rowLength)
            return  input;
        else {
            return input.substring(0, rowLength) + "\n" + input.substring(rowLength, input.length());
        }
    }
    */

    /* Wrap - generic
    public static String wrap(String input, int rowLength) {

        if (input.length() <= rowLength)
            return  input;
        else {
            return input.substring(0, rowLength) + "\n" + wrap(input.substring(rowLength, input.length()), rowLength);
        }
    }
    */






























    /*public String wrap(String row, int rowLength) {
        if(row.length() < rowLength) {
            return row;
        } else {
            return row.substring(0, rowLength) + "\n" + wrap(row.substring(rowLength, row.length()), rowLength);
        }
    }*/















    /*
    public String wrap(String in, int length) {

        if(in.length() < length) {
            return in;
        } else {
            return in.substring(0, length) + "\n" + in.substring(length, in.length());
        }
    }

*/


























    /*
    public String wrap(int rowLength, String in) {
        if(in.length() < rowLength) {
            return in;
        } else {
            StringBuffer sb = new StringBuffer();
            List<String> strings = new ArrayList<String>();
            for (int start = 0; start < in.length(); start += rowLength) {
                sb.append(in.substring(start, Math.min(in.length(), start + rowLength)));
                sb.append("\n");
                strings.add(in.substring(start, Math.min(in.length(), start + rowLength)));
            }
            return sb.substring(0, sb.length()-1).toString();
        }
    }
    */




























    /*
    public String wrap(String in, int rowLength) {

        if(in==null) {
            return null;
        }

        if(in.length() < rowLength) {
            return in;
        } else {
            StringBuffer sb = new StringBuffer();
            List<String> strings = new ArrayList<String>();
            for (int start = 0; start < in.length(); start += rowLength) {
                sb.append(in.substring(start, Math.min(in.length(), start + rowLength)));
                sb.append("\n");
                strings.add(in.substring(start, Math.min(in.length(), start + rowLength)));
            }
            return sb.substring(0, sb.length()-1).toString();

        }
    }
    */










    /*
    public String wrapString(String in, int rowLength) {




        /*




                if(in.length() < rowLength) {
            return in;
        } else {
            StringBuffer sb = new StringBuffer();
            List<String> strings = new ArrayList<String>();
            for (int start = 0; start < in.length(); start += rowLength) {
                sb.append(in.substring(start, Math.min(in.length(), start + rowLength)));
                sb.append("\n");
                strings.add(in.substring(start, Math.min(in.length(), start + rowLength)));
            }
            return sb.substring(0, sb.length()-1).toString();
        }


      */









//        return in;

//        if(in.length() < rowLength) {
//            return in;
//        } else {
//            StringBuffer sb = new StringBuffer();
//            sb.append(in.substring(0, rowLength));
//            sb.append("\n");
//            sb.append(in.substring(rowLength, in.length()));
//            return sb.toString();
//        }


//        if(in.length() < rowLength) {
//            return in;
//        } else {
//            StringBuffer sb = new StringBuffer();
//            List<String> strings = new ArrayList<String>();
//            for (int start = 0; start < in.length(); start += rowLength) {
//                sb.append(in.substring(start, Math.min(in.length(), start + rowLength)));
//                sb.append("\n");
//                strings.add(in.substring(start, Math.min(in.length(), start + rowLength)));
//            }
//            return sb.substring(0, sb.length()-1).toString();
        //}
//    }









//    public String wrap(String in, int rowLength) {
//        if(in.length() < rowLength) {
//            return in;
//        } else {
//            StringBuffer sb = new StringBuffer();
//            sb.append(in.substring(0, Math.min(in.length(), 0 + rowLength)));
//            sb.append("\n");
//            sb.append(in.substring(rowLength, in.length()));
//            return sb.toString();
//        }
//    }


// public String wrap(String in, int rowLength) {
//
//
//       if(in.length() < rowLength) {
//            return in;
//        } else {
//            StringBuffer sb = new StringBuffer();
//            List<String> strings = new ArrayList<String>();
//            for (int start = 0; start < in.length(); start += rowLength) {
//                sb.append(in.substring(start, Math.min(in.length(), start + rowLength)));
//                sb.append("\n");
//                strings.add(in.substring(start, Math.min(in.length(), start + rowLength)));
//            }
//            return sb.substring(0, sb.length()-1).toString();
//        }
// }


//
//
//
//
//        if(in.length() < rowLength) {
//            return in;
//        } else {
//            StringBuffer sb = new StringBuffer();
//            List<String> strings = new ArrayList<String>();
//            for (int start = 0; start < in.length(); start += rowLength) {
//                sb.append(in.substring(start, Math.min(in.length(), start + rowLength)));
//                sb.append("\n");
//                strings.add(in.substring(start, Math.min(in.length(), start + rowLength)));
//            }
//            return sb.substring(0, sb.length()-1).toString();
//        }
//
//    }


}
