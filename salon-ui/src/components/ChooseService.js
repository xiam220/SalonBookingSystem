import React from 'react';

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
                {
                    salonServices.map(salonService =>
                        <ul> 
                            {salonService.name}
                            {salonService.price}
                            {salonService.description}
                            {salonService.timeInMinutes}
                        </ul>
                    )
                }
            </div>
        )
    }
}

export default ChooseService;