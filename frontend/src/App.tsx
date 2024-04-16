import {useEffect, useState} from 'react'
import './App.css'
import axios from 'axios';

function City() {
    const [response, setResponse] = useState([])
    const getData = async ()=>{
        try {
            const res = await axios.get('/api/v1/city/1');
            setResponse(res.data);
        }
        catch (err) {
            console.log("error");
        }
    }
    useEffect(()=>{
        getData();
    }, []);
    if (response) {
        return (<h1>My city {JSON.stringify(response)}</h1>)
    } else{
        return (<h1>My city</h1>)
    }
}
function App() {
  return (
    <>
      <City/>
    </>
  )
}

export default App
