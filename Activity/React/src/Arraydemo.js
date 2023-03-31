import React from "react";
import { Player } from "./Player";

function ArrayDemo(){
    //const players = ["Virat","Rohit","Suryakumar","Hardik"];
    const players=[
        {id:1,name:"Virat",country:"India",runs:9981},
        {id:2,name:"Rohit",country:"India",runs:8989},
        {id:3,name:"Suryakumar",country:"India",runs:7981},
        {id:4,name:"Hardik",country:"India",runs:6981}
    ];
    const playersList=players.map(player=><Player player={player}/>);
    return (
        <div>
            {playersList}
        </div>
    )
}
            
export default ArrayDemo;