import React, { Component } from "react";

// function Demoevent(){
//    function message(){
//         console.log('You have clicked...');
//     }
//     return(
//         <div>
//             <h2>Demo On Event</h2>
//             <button onClick={message}>Click Here</button>
//         </div>
//     )

// }

class Demoevent extends Component{
    constructor(props){
        super(props);
        this.state={
            value:"Hello"
        }
        this.message=this.message.bind(this);
    }
    message(){
        console.log('You have clicked...');
        this.setState({value:"Welcome"});
    }
    render(){
        return(
            <div>
                <h2>Demo on Event</h2>
                <button onClick={this.message.bind(this)}>Click Here</button><br></br>
                <button onClick={this.message}>Click Here</button>
                <h3>{this.state.value}</h3>
            </div>
        )
    }

}

export default Demoevent;