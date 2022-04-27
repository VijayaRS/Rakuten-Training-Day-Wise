
//The following example shows how to list the files in a particular directory by using the eachFile function of the File class.

class User6 {
   static void main(String[] args) {
      new File("Temp").eachFile() {  
         file->println file.getAbsolutePath()
      }
   } 
}

/*If you want to recursively display all of files in a directory 
 * and its subdirectories,then 
 you would use the eachFileRecurse function of the File class.
*/