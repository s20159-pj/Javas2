package pl.pjakt.gameplay1.Service;

import org.springframework.stereotype.Service;
import pl.pjakt.gameplay1.Model.Player;

import java.util.ArrayList;
import java.util.List;

@Service

public class PlayerService {

    public List<Player> findAll(){
        return List.of(
                new Player(1,"Player One",10,100 ),
                new Player(2,"Player Two",15,70 )
        );
    }
}
