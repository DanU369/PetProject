import React from 'react';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import HomePage from "./routes/HomePage";
import About from "./routes/About";
import Contacts from "./routes/Contacts";
import Layout from "./headerAndFooter/Layout";


const App = () => {
    return (
        <BrowserRouter>
            <Layout>
                <Routes>
                    <Route path="/" element={<HomePage/>}/>
                    <Route path="/about" element={<About/>}/>
                    <Route path="/contacts" element={<Contacts/>}/>
                </Routes>
            </Layout>
        </BrowserRouter>

    );
};

export default App;
