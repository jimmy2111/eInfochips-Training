import React from "react";

// function Sample(){
//     return <h3>Welcome to Session </h3>
// }
const Sample=(props)=>{
    return(
        
        <div>
            <h1>Hello</h1>
    <h3>Welcome to Session using Arrow Function {props.name}--{props.className}--{props.children}</h3>
    </div>
    );
}

export default Sample;