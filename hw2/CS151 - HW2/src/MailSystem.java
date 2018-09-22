   import java.util.ArrayList;
    
    /**
       A system of voice mail boxes.
    */
    public class MailSystem
    {
       /**
          Constructs a mail system with a given number of mailboxes
         @param mailboxCount the number of mailboxes
      */
      public MailSystem(int mailboxCount)
      {
         mailboxes = new ArrayList<>();
   
         // Initialize mail boxes.
  
         for (int i = 0; i < mailboxCount; i++)
         {
            String passcode = "" + (i + 1);
            String greeting = "You have reached mailbox " + (i + 1)
                  + ". \nPlease leave a message now.";
            mailboxes.add(new Mailbox(passcode, greeting));
         }
      }
   
      /**
         Locate a mailbox.
         @param ext the extension number
         @return the mailbox or null if not found
      */
      public Mailbox findMailbox(String ext)
      {
    	 
    	  try { //try catch added to incorporate when a user enters in a wrong mailbox.
    		  //it wont crash the program
         int i = Integer.parseInt(ext);
         if (1 <= i && i <= mailboxes.size())
            return  mailboxes.get(i - 1);
    	  }
    	  catch(java.lang.NumberFormatException wrong) {
    		  System.out.println("Enter a correct mailbox");
    	  }
    	  
    	  
         return null;
      }
   
      private ArrayList<Mailbox> mailboxes;
   }