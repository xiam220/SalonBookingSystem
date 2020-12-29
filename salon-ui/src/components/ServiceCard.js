import React from 'react';
import '../styling/ServiceCard.css'

class ServiceCard extends React.Component {

    constructor(props){
        super(props);
    }

    render(){
        return (
            <div class="card">
                <div class="card-body">
                    <h3 class="card-title">{this.props.name}</h3>
                    <h2 class="card-text">${this.props.price}</h2>
                    <p class="card-text">
                        {this.props.description}<br></br>
                        {this.props.timeInMinutes} Minutes
                    </p>
                    <button type="button" class="btn btn-outline-secondary">Book Appointment</button>
                    {/* <a href="#" class="btn btn-primary">Go somewhere</a> */}
                </div>
            </div>
        );
    }
}

export default ServiceCard