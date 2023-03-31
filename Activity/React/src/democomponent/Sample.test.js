import {render,screen} from '@testing-library/react';
import Sample from "./Sample";


test('This testing for Sample.js', () => { 
    render(<Sample/>)

    const var1=screen.getByText('Hello');
    expect(var1).toBeInTheDocument();
})