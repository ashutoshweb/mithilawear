import React from 'react';


const MithilaNavComponent = ()=>{


        return(
            <div className="container">
                <nav className="navbar navbar-expand-sm navbar-dark bg-primary mb-3 fixed-top">
                    <div className="container">
                        <a className="navbar-brand" href="#">Ashapur</a>
                        <button className="navbar-toggler" data-toggle="collapse" data-target="#navbarNav">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarNav">
                            <ul className="navbar-nav">
                                <li className="nav-item">
                                    <a className="nav-link" href="#">Home</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="#">About</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="#">Services</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="#">Contact</a>
                                </li>
                            </ul>

                            <form className="form-inline ml-auto">
                                <div className="row">
                                <input type="text" className="form-control  col" placeholder="Search"/>
                                    <button className="btn btn-outline-dark col">Search</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </nav>
            </div>
        )



};

export default MithilaNavComponent;

