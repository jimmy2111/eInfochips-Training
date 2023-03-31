import React from 'react'
import {useFormik} from 'formik'

export const Userformikform = () => {
    const frm=useFormik({
        initialValues:{
            uname:'Jimmy',
            email:'',
            lang:''
        },
        onSubmit:values=>{
            console.log(frm.values);
        }

    })
  return (
    <div>
    <div>Userformikform</div>
    <form onSubmit={frm.handleSubmit}>
     User Name: <input type="text" id="uname" name="uname" value={frm.values.uname} onChange={frm.handleChange}/><br/>
     Email: <input type="text" id="email" name="email" value={frm.values.email} onChange={frm.handleChange}/><br/>
     Technology:
      <select id="lang" name="lang" value={frm.values.lang} onChange={frm.handleChange}>   
        <option value="java">Java</option>
        <option value="angular">Angular</option>
        <option selected value="react">React</option>
      </select><br/>
      <input type="submit" value="Submit"/>
      
      </form>
      </div>
  )
}
