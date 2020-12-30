import React from 'react';
import ServiceCard from './ServiceCard';
import '../styling/ChooseService.css'

class ChooseService extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            salonServices: []
        }
    }

    componentDidMount() {
        fetch("http://localhost:8080/api/services/retrieveAvailableSalonService")
        .then(data => data.json())
        .then(json => {
            this.setState({
                salonServices: json
            })
        });
    }

    render() {
        var { salonServices } = this.state;

        return (
            <div className="ChooseService">
                <div className="cards">           
                    {
                        salonServices.map(salonService =>
                            
                            <ServiceCard 
                                name={salonService.name}
                                price={salonService.price}
                                description={salonService.description}
                                timeInMinutes={salonService.timeInMinutes}
                            />
                                    
                            
                        )
                    
                    }
                </div>
            
                </div>           
        )
    }
}

export default ChooseService;