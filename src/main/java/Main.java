import online.scratchapi.ScratchProject;
import online.scratchapi.ScratchUser;

import java.util.List;


public class Main {



    public static void main(final String[] args) throws Exception {
        //ScratchSession session = Scratch.createSession("paulolc", "Lhmityd");
        //System.out.println( session.getUsername() );

        ScratchUser user = new ScratchUser("paulolc");
        System.out.println( "user.getUsername(): " + user.getUsername() );
        List<ScratchProject> favoriteProjects = user.getProjects();
        for( ScratchProject scratchProject:favoriteProjects ){
            System.out.println("Project Title: " + scratchProject.getDescription());
        }

    }
}
