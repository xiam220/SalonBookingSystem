import React from 'react';
// import { Subject } from 'rxjs';
import '../styling/LoadingIndicator.css'

const LoadingIndicator = () => {
    return (
        <div class="progress">
            <div class="progress-bar w-25" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">25%</div>
        </div>
    )
}

export default LoadingIndicator;