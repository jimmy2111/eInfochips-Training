import React, { Component } from 'react'

export class Userregistration extends Component {

    constructor(props){
        super(props);
        this.state={uname:'',
                    lang:'React'
                }
        this.changeName=this.changeName.bind(this);
        this.changeLanguage=this.changeLanguage.bind(this);
        this.validateValue=this.validateValue.bind(this);
    }
    changeName(event){
        this.setState({uname:event.target.value});
        console.log(this.uname);
    }
    changeLanguage(event){
        this.setState({lang:event.target.value});
    }
    validateValue(event){
        alert(this.state.lang+' '+this.state.uname);
        event.preventDefault();
    }

  render() {
    return (
        <div>
      <div>Userregistration</div>
      <form onSubmit={this.validateValue}>
      Name: <input type="text" value={this.state.uname} onChange={this.changeName}/><br/>
      Technology:
      <select value={this.state.lang} onChange={this.changeLanguage}>   
        <option value="java">Java</option>
        <option value="angular">Angular</option>
        <option value="react">React</option>
      </select><br/>
      <input type="submit" value="Submit"/>
      
      </form>
      </div>
    )
  }
}

export default Userregistration