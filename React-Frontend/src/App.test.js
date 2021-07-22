import { render, screen } from '@testing-library/react';
import { configure } from "enzyme";
import { shallow } from 'enzyme';
import Adapter from "enzyme-adapter-react-16";
configure({ adapter: new Adapter() });

import App from './App';

test('renders create button', () => {
    render(<App />);
    const linkElement = screen.getAllByText("Create");
    expect(document.querySelector("a").getAttribute("href")).toBe("#createEmployee")
});

it("renders without crashing", () => {
  shallow(<App />);
 
});

