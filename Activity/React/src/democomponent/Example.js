import React, { Component } from "react";

class Example extends Component{
    constructor(props){
        super(props)
        this.state={count:0};
    }
    increment(){
        this.setState({count:this.state.count+1})
    }
    decrement(){
        this.setState({count:this.state.count-1})
    }
    render(){
        return <div>
            <h2>Welcome to Class Component</h2>
            <h2>Session</h2>
            <button onClick={()=>this.increment()}>Click Here +</button>
            <button onClick={()=>this.decrement()}>Click Here -</button>
            <h2>{this.state.count}</h2>
            </div>
    }
}
export default Example;